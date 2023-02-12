package com;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/api/login", method = {RequestMethod.POST})
	public LoginOutput login(@RequestBody LoginInput lgi) throws NoSuchAlgorithmException {
		//該当するユーザが存在しない場合はNGを返す
		if (!userRepository.existsByName(lgi.getName())) {
			LoginOutput lgo = new LoginOutput("NG");
			return lgo;
		}
		//該当するユーザの情報を取得
		User user = userRepository.findByName(lgi.getName());
		//入力されたパスワードをハッシュ化
		String passRow = lgi.getPass();
		//SHA-256
		MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
		byte[] sha256Result = sha256.digest(passRow.getBytes());
		String hashPassInput=String.format("%040x", new BigInteger(1, sha256Result));
		//パスワードが合っているかを判断
		if (hashPassInput.equals(user.getHash_pass())) {
			LoginOutput lgo = new LoginOutput("OK");
			return lgo;
		} else {
			LoginOutput lgo = new LoginOutput("NG");
			return lgo;
		}
	}
	
	@RequestMapping(value="/api/addac", method = {RequestMethod.POST})
	public AddAccountOutput addAccount(@RequestBody AddAccountInput aci) throws NoSuchAlgorithmException {
		//パスワードをハッシュ化し、モデルを作成
		String passRow = aci.getPass();
		//SHA-256
		MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
		byte[] sha256_result = sha256.digest(passRow.getBytes());
		User usr = new User();
		usr.setName(aci.getName());
		usr.setHash_pass(String.format("%040x", new BigInteger(1, sha256_result)));
		userRepository.save(usr);
		AddAccountOutput aco = new AddAccountOutput("OK!");
		return aco;
	}
}

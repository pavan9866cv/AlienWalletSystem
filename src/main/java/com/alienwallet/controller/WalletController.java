package com.alienwallet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallet")
public class WalletController {

	@GetMapping("/getWalletName")
	public String getWalletName() {
		System.out.println("entered into controller");
		System.out.println("for master commit");
		System.out.println("for feature1 ");
		return "AlienWalletSystem";
	}

}

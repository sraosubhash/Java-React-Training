package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Menu;
import com.example.demo.model.Orders;
import com.example.demo.model.Wallet;
import com.example.demo.repo.OrdersRepository;
import com.example.demo.util.SendMail;

import jakarta.persistence.criteria.Order;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private WalletService walletService;
	
	public Orders searchByOrderId(int id) {
		return ordersRepository.findById(id).get();
	}
	
	public String placeOrder(Orders orders) {
		Menu menu = menuService.searchMenu(orders.getMenId());
		Wallet wallet = walletService.searchByCustomerIdAndWalletSource(orders.getCusId(), orders.getWalSource());
		double balance = wallet.getWalAmount();
		double billAmount = orders.getOrdQuantity()*menu.getMenPrice();
		if (balance-billAmount > 0) {
			orders.setOrdStatus("PENDING");
			orders.setOrdBillamount(billAmount);
			ordersRepository.save(orders);
			walletService.updateWallet(orders.getCusId(), orders.getWalSource(), billAmount);
			SendMail.mailSend("anooplavangam17@gmail.com", "Order Placed Sucessfully...", "Your Order Placed"
					+ " And Amount Debited...");
			return "Order Placed Successfully...Amount Debited from WalletSource...";
		}
		SendMail.mailSend("anooplavangam17@gmail.com", "Order Not Placed", "Your Order Unable to Process"
				+ " Because of Insufficient Funds...");
		return "Insufficient Funds...";
	}
}

package eu.arima.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JsfBean {

	private String message;

	private List<String> list;

	public JsfBean() {
		this.message = "Hello Arima!!!";
		this.list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			this.list.add("Message " + i);
		}
	}

	public String getMensaje() {
		return this.message;
	}

	public List<String> getList() {
		return this.list;
	}
}

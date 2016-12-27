package expensemanager.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Expense {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="expense_id")
	private String id;
	private String item;
	private String description;
	private double amount;
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="user_id")
	private User user;
	private Date date;
	
	public Expense() {
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public void setDate(String dateStr, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		try {
			this.date = format.parse(dateStr);
		} catch (ParseException e) {
			throw new RuntimeException(String.format("Issue Parsing Date %s of format %s", dateStr, pattern));
		}
	}
	
}

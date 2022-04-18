package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Contract {
	public final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer number;
	private Date date;
	private Double totalValue;
	
	
	
	public static Calendar cal  = new Calendar() {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void roll(int field, boolean up) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public int getMinimum(int field) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getMaximum(int field) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getLeastMaximum(int field) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getGreatestMinimum(int field) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		protected void computeTime() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		protected void computeFields() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void add(int field, int amount) {
			// TODO Auto-generated method stub
			
		}
	} ;
	
	ArrayList<Installment> installments = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public void addInstallment (Installment installment){
		Date date = Calendar.getInstance().getTime();
		Long long1 = date.getTime();
		
		installments.add(installment);
	}
	
	public void removeInstallment (Installment installment){
		installments.remove(installment);
	}
	
	
	
}

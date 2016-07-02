package edu.cibertec.drools.bean;

/**
 * Created by Java-VS on 02/07/2016.
 */
public class Account {

    private long balance;
    private String id;
    
    private boolean abonado;

    public Account() {
    }

    public Account(long balance, String id) {
        this.balance = balance;
        this.id = id;
    }

    public boolean isAbonado() {
		return abonado;
	}

	public void setAbonado(boolean abonado) {
		this.abonado = abonado;
	}

	public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (abonado ? 1231 : 1237);
		result = prime * result + (int) (balance ^ (balance >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (abonado != other.abonado)
			return false;
		if (balance != other.balance)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", id=" + id + ", abonado="
				+ abonado + "]";
	}
	
	

    
    
    
    
}

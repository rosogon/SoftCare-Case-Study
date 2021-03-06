package eu.ehealth.db.db;

// Generated Oct 1, 2013 11:39:06 AM by Hibernate Tools 3.2.4.GA

/**
 * Communication generated by hbm2java
 */
public class Communication implements java.io.Serializable
{


	private Integer id;
	private String Type;
	private String Value;
	private String Notes;
	private Boolean IsPrimary;
	private Integer persondata;
	private PersonData m_PersonData;


	public Communication()
	{
	}


	public Communication(String Type, String Value, String Notes,
			Boolean IsPrimary, Integer persondata, PersonData m_PersonData)
	{
		this.Type = Type;
		this.Value = Value;
		this.Notes = Notes;
		this.IsPrimary = IsPrimary;
		this.persondata = persondata;
		this.m_PersonData = m_PersonData;
	}


	public Integer getId()
	{
		return this.id;
	}


	public void setId(Integer id)
	{
		this.id = id;
	}


	public String getType()
	{
		return this.Type;
	}


	public void setType(String Type)
	{
		this.Type = Type;
	}


	public String getValue()
	{
		return this.Value;
	}


	public void setValue(String Value)
	{
		this.Value = Value;
	}


	public String getNotes()
	{
		return this.Notes;
	}


	public void setNotes(String Notes)
	{
		this.Notes = Notes;
	}


	public Boolean getIsPrimary()
	{
		return this.IsPrimary;
	}


	public void setIsPrimary(Boolean IsPrimary)
	{
		this.IsPrimary = IsPrimary;
	}


	public Integer getPersondata()
	{
		return this.persondata;
	}


	public void setPersondata(Integer persondata)
	{
		this.persondata = persondata;
	}


	public PersonData getM_PersonData()
	{
		return this.m_PersonData;
	}


	public void setM_PersonData(PersonData m_PersonData)
	{
		this.m_PersonData = m_PersonData;
	}

}

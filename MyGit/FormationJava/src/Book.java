import java.util.Date;

public class Book
{
	private String title;
//	public String authors;
//	public String editor;
	private int id;
	private String isbn;
	private int nbPage;
	private Date date;	
	private String lang;   // code ISO	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getIsbn()
	{
		return isbn;
	}
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	public int getNbPage()
	{
		return nbPage;
	}
	public void setNbPage(int nbPage)
	{
		this.nbPage = nbPage;
	}
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date)
	{
		this.date = date;
	}
	public String getLang()
	{
		return lang;
	}
	public void setLang(String lang)
	{
		this.lang = lang;
	}
	
}

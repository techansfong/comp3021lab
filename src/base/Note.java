package base;
import java.util.Date;
public class Note implements Comparable<Note>
{
	
	private Date date;
	private String title;
	
	public Note(String title)
	{
		this.title = title;
		date = new Date(System.currentTimeMillis());
	}
	
	public String getTitle()
	{
		return title;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Note other = (Note) obj;
		if (title == null) 
		{
			if (other.title != null)
			{
				return false;
			}
		} 
		else if (!title.equals(other.getTitle()))
		{
			return false;
		}
		return true;
	}
	
	public int compareTo(Note o)
	{
		return date.compareTo(o.date);
	}
	
	public String toString()
	{
		return date.toString() + "\t" + title;
	}
	
	public String getContent()
	{
		return "Nothing";
	}
}


package nguyenvanphituoc.model;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="web_info")
public class WebInfo {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer page_id;
	

	@Column(name="description", unique=true, nullable=false)
	private String description;
	

	@Column(name="content", unique=true, nullable=false)
	private String content;


	public Integer getPage_id() {
		return page_id;
	}


	public void setPage_id(Integer page_id) {
		this.page_id = page_id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((page_id == null) ? 0 : page_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof WebInfo))
			return false;
		WebInfo other = (WebInfo) obj;
		if (page_id == null) {
			if (other.page_id != null)
				return false;
		} else if (!page_id.equals(other.page_id))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "webInfo [page_id=" + page_id + ", description=" + description + ", content=" + content+"]";
	}

	
}

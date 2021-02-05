package  com.loteria.entity;
 
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id; 


@Entity
public class Usuario {

	@Id
	@GeneratedValue 
	private Long id;
    private String email;
    
    public Usuario( ) {}
	public Usuario(Long id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
    
    
    
    
}
    
/*	@OneToMany(mappedBy="usuario")
	@ElementCollection
	private List<Numero> jogos  ;
	*/
	 
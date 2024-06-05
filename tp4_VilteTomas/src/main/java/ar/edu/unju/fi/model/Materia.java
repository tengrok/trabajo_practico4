package ar.edu.unju.fi.model;

public class Materia {
	private int codigo;
	private String nombre;
	private String curso;
	private int cantHoras;
	private Modalidad modalidad;
	private Docente docente;
	private String carrera;
	
	public enum Modalidad{
		VIRTUAL, PRECENCIAL
	}
	
	public enum Docente {
		Docente
	}

	public Materia(int codigo, String nombre, String curso, int cantHoras, Modalidad modalidad, Docente docente,
			String carrera) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cantHoras = cantHoras;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre + ", curso=" + curso + ", cantHoras=" + cantHoras
				+ ", modalidad=" + modalidad + ", docente=" + docente + ", carrera=" + carrera + "]";
	}
	
}

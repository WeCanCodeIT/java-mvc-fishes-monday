package org.wecancodeit.fishes;

public class Fish {

	private Long id;

	private String genus;
	private String species;
	
	private boolean tropical;
	private boolean freshwater;

	private String image;
	
	public Long getId() {
		return id;
	}
	
	public String getGenus() {
		return genus;
	}
	public String getSpecies() {
		return species;
	}
	public boolean isTropical() {
		return tropical;
	}
	public boolean getFreshwater() {
		return freshwater;
	}
	
	public String getImage() {
		return image;
	}
	public boolean hasImage() {
		return image != null;
	}
	
	public Fish(long id, String genus, String species, boolean tropical, boolean freshwater) {
		this.id = id;
		this.genus = genus;
		this.species = species;
		this.tropical = tropical;
		this.freshwater = freshwater;
	}
	
	public Fish(long id, String genus, String species, boolean tropical, boolean freshwater, String image) {
		this(id, genus, species, tropical, freshwater);
		this.image = image;
	}

	public String buildBinomialName() {
		return genus + " " + species;
	}
}

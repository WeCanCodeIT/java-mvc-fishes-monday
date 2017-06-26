package org.wecancodeit.fishes;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class FishesRepository {

	private Map<Long, Fish> allTheFishes = new HashMap<>();
	
	public FishesRepository() {
		allTheFishes.put(1L, new Fish(1L, "Neolamprologus", "brevis", true, true));
		allTheFishes.put(2L, new Fish(2L, "Julidochromis", "ornatus", true, true));
		allTheFishes.put(42L, new Fish(42L, "Altolamprologus", "calvus", true, true, "Altolamprologus_calvus_noir.jpg"));
	}
	
	public Iterable<Fish> findAll() {
		return allTheFishes.values();
	}

	public Fish findOne(long id) {
		return allTheFishes.get(id);
	}
}

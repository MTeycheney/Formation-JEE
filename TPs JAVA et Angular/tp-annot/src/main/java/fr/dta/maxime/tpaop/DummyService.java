package fr.dta.maxime.tpaop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

	private List<Dummy> dummies;

	public DummyService() {
		dummies = initDummies();
	}

	public List<Dummy> initDummies() {
		List<Dummy> dummies = new ArrayList<Dummy>();

		dummies.add(new Dummy(1L, "n�" + 1));
		dummies.add(new Dummy(2L, "n�" + 2));
		dummies.add(new Dummy(3L, "n�" + 3));
		dummies.add(new Dummy(7L, "n�" + 7));
		dummies.add(new Dummy(12L, "n�" + 12));
		dummies.add(new Dummy(14L, "n�" + 14));

		return dummies;
	}

	public Dummy getDummy(Long id) {
		return dummies.stream().filter(d -> d.getId() == id).findFirst().get();
	}

	public List<Dummy> getDummies() {
		return dummies;
	}
	
	public void saveDummy(Dummy dummy) throws DummyAlreadyExistsException {
		if (dummies.stream().filter(d -> d.getId() == dummy.getId()).count() > 0) {
			throw new DummyAlreadyExistsException(dummy.getId());
		}
		dummies.add(dummy);
	}

	public void deleteDummmy(Long id) {
		dummies = dummies.stream().filter(d -> d.getId() != id).collect(Collectors.toList());
	}
}

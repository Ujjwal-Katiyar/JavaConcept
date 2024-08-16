package MarkerInterface;

public class AuditService {

	public void audit(Object obj) {
		if (obj instanceof Auditable) {
			System.out.println("Auditable account");
		} else {
			System.out.println("not auditable acccount");
		}
	}

}

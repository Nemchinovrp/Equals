import java.util.List;
import java.util.Date;

public class Course {

    private final Long uuid;

    private final String name;

    private final List<Session> sessions;

    public Course(final Long uuid, final String name, final List<Session> sessions) {
    	this.uuid = uuid;
	this.name = name;
	this.sessions = sessions;
    }
    
    public Long getUuid() {
    	return uuid;
    }

    public String getName() {
    	return name;
    }

    public List<Session> getSessions() {
	return sessions;
    }

    @Override
    public boolean equals(final Object object) {
    	// BEGIN (write your solution here)
	    if (!(object instanceof Course))
		return false;

	final Course that = (Course) object;
	if (!that.getUuid().equals(this.getUuid()))
		return false;

	return true;
	// END
    }

    public class Session {
    
    	private final Date startDate;

	public Session(final Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Course getCourse() {
		return Course.this;
	}

	@Override
	public boolean equals(final Object object) {
		// BEGIN (write your solution here)
		if (!(object instanceof Session)) return false;

		final Session that = (Session) object;
		if (!that.getStartDate().equals(this.getStartDate())) return false;

		if (!that.getCourse().equals(this.getCourse())) return false;

		return true;
		// END
	}

    }

}

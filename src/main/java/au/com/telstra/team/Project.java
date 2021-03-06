package au.com.telstra.team;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Project implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "PROJECT_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "PROJECT_ID_GENERATOR", sequenceName = "Project_id_seq")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Number")
	private java.lang.String number;

	@org.kie.api.definition.type.Label("Type")
	private java.lang.String type;

	@org.kie.api.definition.type.Label("SubType")
	private java.lang.String subType;
	@org.kie.api.definition.type.Label("Status")
	private java.lang.String status;
	@org.kie.api.definition.type.Label("ExpectedStartDate")
	private java.lang.String expectedStartDate;

	@org.kie.api.definition.type.Label("NodeCode")
	private java.lang.String nodeCode;
	@org.kie.api.definition.type.Label("State")
	private java.lang.String state;

	@org.kie.api.definition.type.Label("Office")
	private java.lang.String office;
	@org.kie.api.definition.type.Label(value = "projectName")
	private java.lang.String projectName;
	public Project() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getNumber() {
		return this.number;
	}

	public void setNumber(java.lang.String number) {
		this.number = number;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getSubType() {
		return this.subType;
	}

	public void setSubType(java.lang.String subType) {
		this.subType = subType;
	}
	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getExpectedStartDate() {
		return this.expectedStartDate;
	}

	public void setExpectedStartDate(java.lang.String expectedStartDate) {
		this.expectedStartDate = expectedStartDate;
	}

	public java.lang.String getNodeCode() {
		return this.nodeCode;
	}

	public void setNodeCode(java.lang.String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getOffice() {
		return this.office;
	}

	public void setOffice(java.lang.String office) {
		this.office = office;
	}

	public java.lang.String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(java.lang.String projectName) {
		this.projectName = projectName;
	}

	public Project(java.lang.Long id, java.lang.String number,
			java.lang.String type, java.lang.String subType,
			java.lang.String status, java.lang.String expectedStartDate,
			java.lang.String nodeCode, java.lang.String state,
			java.lang.String office, java.lang.String projectName) {
		this.id = id;
		this.number = number;
		this.type = type;
		this.subType = subType;
		this.status = status;
		this.expectedStartDate = expectedStartDate;
		this.nodeCode = nodeCode;
		this.state = state;
		this.office = office;
		this.projectName = projectName;
	}

}
package wooteco.subway.domain;

public class Name {

	private final String value;

	public Name(String value) {
		validate(value);
		this.value = value;
	}

	private void validate(String value) {
		if (value.isBlank()) {
			throw new IllegalArgumentException("이름은 비어있을 수 없습니다.");
		}
	}

	public boolean isSame(String value) {
		return this.value.equals(value);
	}

	public String getValue() {
		return value;
	}
}

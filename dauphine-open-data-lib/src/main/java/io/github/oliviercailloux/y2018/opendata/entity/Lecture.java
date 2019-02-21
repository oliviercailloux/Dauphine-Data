package io.github.oliviercailloux.y2018.opendata.entity;
import java.util.Date;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import com.google.common.base.Strings;
/**
 *  Implementation of the class lecture with methods of manipulation of attributes   
 * @author Mohamed EL AMRANI
 */
@Entity
public class Lecture extends AbstractEntity {

	
	private static final long serialVersionUID = -6829937183172871605L;
	

	/**
	 * The id Lecture Not <code>null</code>.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Course (basic information about course (author, type ...)
	 */
	@JoinColumn(nullable = false)
	private Course course = new Course();

	/**
	 * Date of Lecture 
	 */
	@Column(nullable = false)
	private Date date = new Date();
	/**
	 * Duration  of Lecture 
	 */
	
	@Column(nullable = false)
	private int duration = 0;

	/**
	 * ROOM  defined like A_B042"
	 */
	@Column(nullable = false)
	private String room = "";

	/**
	 * Group  defined A5
	 * A5STI86 Gr01 M2 IF
	 */
	@Column(nullable = false)
	private String group = "";

	/**
	 * the teacher responsible for the lecture.
	 */
	@JoinColumn(nullable = false)
	private Person teacher = new Person();

	public Lecture() {
	}

	public Lecture(Course course, Date date, int duration, String room, String group, Person teacher) {
		this.course = Objects.requireNonNull(course);
		this.date = Objects.requireNonNull(date);
		this.duration = Objects.requireNonNull(duration);
		this.room = Strings.nullToEmpty(room);
		this.group = Strings.nullToEmpty(group);
		this.teacher = Objects.requireNonNull(teacher);
	}

	/**
	 * Returns this lecture's course.
	 *
	 * @return not <code>null</code>.
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * Sets this lecture's course.
	 *
	 * @param course can't be <code>null</code>
	 */
	public void setCourse(Course course) {
		this.course = Objects.requireNonNull(course);
	}

	/**
	 * Returns this lecture's date.
	 *
	 * @return not <code>null</code>.
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets this lecture's date.
	 *
	 * @param date can't be <code>null</code>
	 */
	public void setDate(Date date) {
		this.date = Objects.requireNonNull(date);
	}
	
	/**
	 * Returns this lecture's duration.
	 *
	 * @return not <code>null</code>.
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Sets this lecture's duration.
	 *
	 * @param date can't be <code>null</code>
	 */
	public void setDuration(int duration) {
		this.duration = Objects.requireNonNull(duration);
	}

	/**
	 * Returns this lecture's room, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * Sets this lecture's room.
	 *
	 * @param room if <code>null</code>, will be converted to an empty string.
	 */
	public void setRoom(String room) {
		this.room = Strings.nullToEmpty(room);
	}

	/**
	 * Returns this lecture's group, or an empty string if unknown.
	 *
	 * @return not <code>null</code>.
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * Sets this lecture's group.
	 *
	 * @param group if <code>null</code>, will be converted to an empty string.
	 */
	public void setGroup(String group) {
		this.group = Strings.nullToEmpty(group);
	}

	/**
	 * Returns this lecture's teacher.
	 *
	 * @return not <code>null</code>.
	 */
	public Person getTeacher() {
		return teacher;
	}

	/**
	 * Sets this lecture's teacher.
	 *
	 * @param teacher can't be <code>null</code>
	 */
	public void setTeacher(Person teacher) {
		this.teacher = Objects.requireNonNull(teacher);
	}

}
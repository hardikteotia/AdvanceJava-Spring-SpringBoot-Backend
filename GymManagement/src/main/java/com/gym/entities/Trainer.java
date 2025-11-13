package com.gym.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*| Field          | Type                               | Description                   |
| -------------- | ---------------------------------- | ----------------------------- |
| trainer_id     | Long (Auto Generated, Primary Key) | Unique identifier             |
| name           | String                             | Trainer’s name                |
| specialization | String                             | e.g., Weight Training, Cardio |
| experience     | Integer                            | Number of years of experience |
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trainers")
@Entity
public class Trainer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainerId")
	private Long trainerId;
	
	@Column(name = "trainerName", nullable = false)
	private String trainername;
	@Column(name = "trainerspecialization", nullable = false)
	private String trainerspecialization;
	@Column(name = "trainerexperience", nullable = false)
	private Integer trainerexperience;
	
	 // One Trainer can have many Members
    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL)
    private List<Member> members;
	
}

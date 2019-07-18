package avielts.nhuqp.core.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "courseEntity")
    public List<LessonEntity> lessonEntityList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "courseEntity")
    public List<SectionEntity> sectionEntities;

    public String title;
    public String img;
    public Double price;
    public String overview;
    public String description;

}

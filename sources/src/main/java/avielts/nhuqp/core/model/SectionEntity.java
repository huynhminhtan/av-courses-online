package avielts.nhuqp.core.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sections")
public class SectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @ManyToOne
    @JoinColumn(name = "courseID")
    public CourseEntity courseEntity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sectionEntity")
    public List<LessonEntity> lessonEntityList;

    public String title;
    public String description;
}

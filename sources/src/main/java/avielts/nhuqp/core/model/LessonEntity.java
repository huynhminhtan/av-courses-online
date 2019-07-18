package avielts.nhuqp.core.model;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class LessonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @ManyToOne
    @JoinColumn(name = "courseID")
    public CourseEntity courseEntity;

    @ManyToOne
    @JoinColumn(name = "sectionID")
    public SectionEntity sectionEntity;

    public String title;
    public String time;
    public boolean isLooked;
    public String urlVideo;
    public String content;
}

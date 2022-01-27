package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private String series;

    public Car() {
    }

    public Car(String model, String series) {
        this.model = model;
        this.series = series;
    }

    @OneToOne(mappedBy = "car")
    private User user;

    @Override
    public String toString() {
        return "model = '" + model + '\'' +
                ", series = '" + series + '\'';
    }
}

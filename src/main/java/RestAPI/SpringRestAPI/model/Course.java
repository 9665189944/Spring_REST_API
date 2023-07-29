package RestAPI.SpringRestAPI.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Course {
    private String batchCode;
    private String subject;
    private String faculty;
    private int totalStudent;

}

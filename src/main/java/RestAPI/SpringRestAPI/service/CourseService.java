package RestAPI.SpringRestAPI.service;

import RestAPI.SpringRestAPI.model.Course;
import RestAPI.SpringRestAPI.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CourseService {
    List<Course> coursesList=new ArrayList<>();
    {
        coursesList.add(  new Course("1ccm25","java","Akshay",30));
        coursesList.add(  new Course("3MMC5","SQL","Amit",50));
        coursesList.add(  new Course("PPCM31","WT","Ajit",60));

    }
    public List<Course> getCourse(){
        return coursesList;
    }


    public Course getCoursesBySubject(String subject)
    {
        Course course=null;
       for(int i=0;i<coursesList.size();i++)
        {
            Course c=coursesList.get(i);
            if(c.getSubject().equals(subject))
            {
                course=c;

            }
        }
        return course;
    }
    public Course getCoursesByFaculty(String faculty)
    {
        Course cours=null;
        for(int i=0;i<coursesList.size();i++)
        {
            Course f=coursesList.get(i);
            if(f.getFaculty().equals(faculty))
            {
                cours=f;

            }
        }
        return cours;
    }
    public void addCourse( Course p)
    {
        coursesList.add(p);
    }


    public void deleteCourse( String batchCode)
    {
        Iterator<Course> itr = coursesList.iterator();
        while (itr.hasNext()) {
            if (itr.next().getBatchCode().equals(batchCode) ){
                itr.remove();
            }
        }
    }
}



import { Component } from "@angular/core";
import { Student } from "../../models/Student";
@Component({
  selector:'student-sample',
  templateUrl:'studentsample.component.html',
  styleUrls:['studentsample.component.scss'],
  standalone:true
})
export class StudentSampleComponent {
  student : Student;
  constructor(){
    this.student = new Student(1,"Ravi Sharma",null,"1234567891","ravi.sharma@gmail.com","Bhopal, Tower 2");
  }
  logStudentAttributes() : void{
    console.log("student:",this.student);
  }
}

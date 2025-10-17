import { Component } from "@angular/core";
import { Teacher } from "../../models/Teacher";

@Component({
    selector:'teacher-sample',
    templateUrl:'teachersample.component.html',
    styleUrls:['teachersample.component.scss'],
    standalone:true
})
export class TeacherSampleComponent  {
    teacher : Teacher;
  constructor(){
    this.teacher = new Teacher(1,"Ravi Sha","null","1234567891","ravi.sharma@gmail.com",2);
  }
  logTeacherAttributes() : void{
    console.log("teacher:",this.teacher);
  }
  
}

import { Component } from "@angular/core";
import { Student } from "../../models/Student";

@Component({
    selector:'student-create',
    templateUrl:'./studentcreate.component.html',
    styleUrls:['./studentcreate.component.scss']
})
export class StudentCreateComponent {
    student: Student;
    successMessage: string | null;
    errorMessage: string | null;

    constructor()
    {
        this.student=new Student(0,"",null,"","","")
    }

    onSubmit(): void
    {
        if(!this.student.fullName || !this.student.dateOfBirth || !this.student.email || !this.student.contactNumber || !this.student.address)
        {
            this.successMessage=null;
            this.errorMessage="Please fill in all required fields."
        }
        else
        {
            this.successMessage="Student created successfully!";
            this.errorMessage=null;
        }
    }

    resetForm(): void
    {
        this.student=new Student(0,"",null,"","","")
        this.successMessage=null;
        this.errorMessage=null;
    }
}

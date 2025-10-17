import { Component } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
    selector:'app-coursecreate',
    templateUrl: './coursecreate.component.html',
    styleUrls:['./coursecreate.component.scss']
})

export class CourseCreateComponent {
    courseForm:FormGroup;
    successMessage :string;
    errorMessage :string;
 
    constructor(private fb: FormBuilder)
    {
        this.courseForm=this.fb.group({
            courseId:[0],
            courseName: ['', [Validators.required]],
            description:['', [Validators.required, Validators.maxLength(500)]],
            teacherId:[null, [Validators.required, Validators.pattern('^\\d+$')]]
        });
    }
    get f()
    {
        return this.courseForm.controls;
    }

    onSubmit(): void
    {
        this.successMessage='';
        this.errorMessage='';

        if(this.courseForm.invalid)
        {
            this.errorMessage='Error';
            return;
        }
        let teacher=this.courseForm.value;
        this.successMessage= 'Course created successfully!';
        this.courseForm.reset();
    }

    resetForm(): void
    {
        this.courseForm.reset();
        this.successMessage='';
        this.errorMessage='';
    }

}

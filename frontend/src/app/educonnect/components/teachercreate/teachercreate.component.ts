import { Component } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
    selector:'app-teachercreate',
    templateUrl: './teachercreate.component.html',
    styleUrls:['./teachercreate.component.scss']
})
export class TeacherCreateComponent {
    teacherForm:FormGroup;
    successMessage :string;
    errorMessage :string;

    constructor(private fb: FormBuilder)
    {
        this.teacherForm=this.fb.group({
            // teacherId: number;
            teacherId:[0],
            // fullName: string;
            fullName: ['',[Validators.required]],
            // contactNumber: string;
            contactNumber: ['',[Validators.required, Validators.pattern('^\\d{10}$')]],
            // email: string;
            email: ['', [Validators.required, Validators.email]],
            // subject: string;
            subject: ['', [Validators.required]],
            // yearsOfExperience: number;
            yearsOfExperience: [0, [Validators.required, Validators.min(1)]]
        });
    }

    get f()
    {
        return this.teacherForm.controls;
    }

    onSubmit(): void
    {
        this.successMessage='';
        this.errorMessage='';

        if(this.teacherForm.invalid)
        {
            this.errorMessage='Error';
            return;
        }
        let teacher=this.teacherForm.value;
        this.successMessage= 'Teacher created successfully!';
        this.teacherForm.reset();
        
    }

    resetForm(): void
    {
        this.teacherForm.reset();
        this.successMessage='';
        this.errorMessage='';
    }
}
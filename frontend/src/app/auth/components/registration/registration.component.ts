import { Component } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
    selector:'app-registration',
    templateUrl:'./registration.component.html',
    styleUrls:['./registration.component.scss']
})

export class RegistrationComponent  {
    
    registrationForm: FormGroup;
    successMessage: string | null = null;
    errorMessage: string | null = null;

    constructor(private fb: FormBuilder)
    {
        this.registrationForm= this.fb.group({
            username:['', Validators.required],
            email:['', [Validators.required, Validators.email]],
            password:['',[Validators.required, Validators.minLength(8)]],
            role:['', Validators.required],


            fullName:[''],
            contactNumber:[''],
            subject:[''],
            yearsOfExperience:[null],
            dateOfBirth:[''],
            address:['']
        });
    }

    onSubmit(): void
    {
        this.successMessage=null;
        this.errorMessage=null;

        if(this.registrationForm.invalid)
        {
            this.errorMessage='Please fill out all fields correctly.';
            return;
        }
        this.successMessage='Registration successful!';
    }
}

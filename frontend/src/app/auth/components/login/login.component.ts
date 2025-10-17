import { Component } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
    selector:'app-login',
    templateUrl:'./login.component.html',
    styleUrls:['./login.component.scss']
})

export class LoginComponent  {
    loginForm: FormGroup;
    successMessage: string | null =null;
    errorMessage: string | null=null;
    
    constructor(private fb: FormBuilder)
    {
        this.loginForm=this.fb.group({
            username:['', Validators.required],
            password:['', Validators.required]
        });
    }
    onSubmit(): void
    {
        this.successMessage=null;
        this.errorMessage=null;

        if(this.loginForm.invalid)
        {
            this.errorMessage='Please fill out all fields correctly.';
            return;
        }
        this.successMessage='Login successful!';
    }
}

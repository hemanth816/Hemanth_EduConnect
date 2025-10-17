import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { EduConnectRoutingModule } from "./educonnect-routing.module";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { StudentCreateComponent } from "./components/studentcreate/studentcreate.component";
import { TeacherCreateComponent } from "./components/teachercreate/teachercreate.component";
import { CourseCreateComponent } from "./components/coursecreate/coursecreate.component";
// import { StudentSampleComponent } from "./components/studentsample/studentsample.component";
@NgModule({
  declarations: [
  // StudentSampleComponent
  StudentCreateComponent,
  TeacherCreateComponent,
  CourseCreateComponent,

  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule,
  ],
  exports: [
    
  ]
})
export class EduconnectModule {}

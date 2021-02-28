import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-adminregister',
  templateUrl: './adminregister.component.html',
  styleUrls: ['./adminregister.component.css']
})
export class AdminregisterComponent implements OnInit {

  model: HomeModel = {
    email: '',
    password: '',
    repassword:'',
    username:''
  };
  constructor() { }

  ngOnInit(): void {
    this.onSubmit();

  }
  onSubmit() : void {
    let email = this.model.email;
    let password = this.model.password;
    let repassword = this.model.repassword;
    let username = this.model.username;

    if(email!=''&&password == repassword && username !='') {
      // location.reload();
      alert("Register succesfull");
      location.assign('http://localhost:4200/adminlogin');
    }
  }


}
export interface HomeModel {
  email:string;
  password:string;
  repassword:string;
  username:string;
}

import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  model: HomeModel = {
    email: '',
    password: ''
  };
  constructor() { }

  ngOnInit(): void {
    this.onSubmit();

  }
  onSubmit() : void {
    let email = this.model.email;
    let password = this.model.password;

    if(email == 'sivasenthil@gmail.com' && password == 'admin') {
      // location.reload();
      location.assign('http://localhost:4200/adminverifyStaff');
    }
  }

}
export interface HomeModel {
  email:string;
  password:string;
}

import { Component, OnInit } from '@angular/core';
import { GetHotelService } from './get-hotel.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Booking';

  response;
  constructor(private getService: GetHotelService){

  }

  ngOnInit(){
    this.getService.getHotel().subscribe(data => this.response=data);
    
  }
}

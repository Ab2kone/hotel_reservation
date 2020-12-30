import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GetHotelService {

  constructor(private httpClient: HttpClient) { }

  getHotel(){
    return this.httpClient.get("http://localhost:8080/hotels", {responseType:"text"});
  }
}

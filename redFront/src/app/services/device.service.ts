import { Injectable } from '@angular/core';
import { Device } from '../models/device';
import { map } from 'rxjs/operators';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class DeviceService {
  DEVICES_URL = 'https://localhost:8083/devices/';


  constructor(private httpClient: HttpClient) { }
  getDevices(): Observable<Device[]> {
    return this.httpClient.get<any>
      (this.DEVICES_URL).pipe(map(response => {
        console.log(response);
        return response.content;
      }));
  }
}

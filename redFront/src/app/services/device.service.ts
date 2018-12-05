import { Injectable } from '@angular/core';
import { Device } from '../models/device';
import { map } from 'rxjs/operators';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class DeviceService {
  DEVICES_URL = 'http://localhost:8083/devices/';
  ROOM_URL = 'http://localhost:8083/rooms/';


  constructor(private httpClient: HttpClient) { }

  getDevices(id: number): Observable<Device[]> {
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa('redHome:homered3') });

    return this.httpClient.get<any>
      (this.ROOM_URL + id,  { headers } ).pipe(map(response => {
        return response.devices;
      }));
  }

  updateDevice(device: Device) {
  const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa('redHome:homered3') });


    return this.httpClient.put<Device>
            (this.DEVICES_URL + device.id ,  device ,  { headers });
  }
}

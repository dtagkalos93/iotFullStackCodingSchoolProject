import { Injectable } from '@angular/core';
import { Device } from '../models/device';
import { DEVICES } from '../mock-device';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DeviceService {

  constructor() { }
  getDevices(): Observable<Device[]> {
    return of(DEVICES);
  }
}

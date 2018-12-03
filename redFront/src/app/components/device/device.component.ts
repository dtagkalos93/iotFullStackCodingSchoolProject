import { Component, OnInit } from '@angular/core';
import { Device } from 'src/app/models/device';
import { DeviceType } from 'src/app/models/device-type';
import { DeviceService } from 'src/app/services/device.service';

@Component({
  selector: 'app-device',
  templateUrl: './device.component.html',
  styleUrls: ['./device.component.css']
})
export class DeviceComponent implements OnInit {
  devices: Device[];
  selectedDevice: Device;


    displayDialog: boolean;

  constructor(private deviceService: DeviceService) { }

  ngOnInit() {
      this.deviceService.getDevices()
      .subscribe(data => {
        this.devices = data;
        for (let i = 0 ; i < this.devices.length; i++) {
          console.log(this.devices[i].name);
          console.log(this.devices[i].status + '');
          console.log(this.devices[i].deviceType.typeName);
        }

      });

  }

  selectDevice(event: Event, device: Device) {
    this.selectedDevice = device;
    this.displayDialog = true;
    event.preventDefault();
  }

  onDialogHide() {
    this.selectedDevice = null;
}
}

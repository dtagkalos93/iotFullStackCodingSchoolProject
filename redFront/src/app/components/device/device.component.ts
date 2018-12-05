import { Component, OnInit, DoCheck } from '@angular/core';
import { Device } from 'src/app/models/device';
import { DeviceType } from 'src/app/models/device-type';
import { DeviceService } from 'src/app/services/device.service';
import { ActivatedRoute } from '@angular/router';
import { Router, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-device',
  templateUrl: './device.component.html',
  styleUrls: ['./device.component.css']
})
export class DeviceComponent implements OnInit {
  devices: Device[];
  selectedDevice: Device;

  navigationSubscription;
  displayDialog: boolean;
  change = false;

  constructor(private deviceService: DeviceService, private route: ActivatedRoute, private router: Router) {
    this.navigationSubscription = this.router.events.subscribe((e: any) => {
      // If it is a NavigationEnd event re-initalise the component
      if (e instanceof NavigationEnd) {
        this.initialiseInvites();
      }
    });
   }

   initialiseInvites() {
    // Set default values and re-fetch any data you need.
    const id = Number(this.route.snapshot.paramMap.get('id'));
      console.log(id);

      this.deviceService.getDevices(id)
      .subscribe(data => {
        this.devices = data;
        // for (let i = 0 ; i < this.devices.length; i++) {
        //   console.log(this.devices[i].name);
        //   console.log(this.devices[i].status + '');
        //   console.log(this.devices[i].deviceType.typeName);
        // }

      });
  }

  ngOnInit() {
  }



  selectDevice(event: Event, device: Device) {
    this.selectedDevice = device;
    this.displayDialog = true;
    event.preventDefault();
  }

  saveChanges() {
    if (this.change) {
    this.deviceService.updateDevice(this.selectedDevice)
    .subscribe(data => {
      this.displayDialog = false;
      console.log('Update' , data);
      this.selectedDevice = data;
    });
    }
  }

  handleChange(e) {
    this.change = !this.change;
  }

  onDialogHide() {
    this.selectedDevice = null;
}
}

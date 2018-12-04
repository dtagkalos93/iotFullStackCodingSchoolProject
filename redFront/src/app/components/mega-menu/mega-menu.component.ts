import { Component, OnInit } from '@angular/core';
import {MenuItem} from 'primeng/api';
import { Room } from 'src/app/models/room';
import { HomeService } from 'src/app/services/home.service';

@Component({
  selector: 'app-mega-menu',
  templateUrl: './mega-menu.component.html',
  styleUrls: ['./mega-menu.component.css']
})
export class MegaMenuComponent implements OnInit {
  room: Room[];
  constructor(private homeSercive: HomeService) { }

  items: MenuItem[];
  ngOnInit() {
    this.homeSercive.getRooms()
      .subscribe(data => {
        this.room = data;
        // for (let i = 0 ; i < this.devices.length; i++) {
        //   console.log(this.devices[i].name);
        //   console.log(this.devices[i].status + '');
        //   console.log(this.devices[i].deviceType.typeName);
        // }

        this.items = [
          {label: 'Home', routerLink: ['/home']}
        ];
        for (let i = 0 ; i < this.room.length; i++) {
          console.log(this.room[i].name);
          this.items.push({label: `${this.room[i].name}`, routerLink: [`/room/${this.room[i].id}`]});
          //   console.log(this.devices[i].name);
          //   console.log(this.devices[i].status + '');
          //   console.log(this.devices[i].deviceType.typeName);
          }
      });

  }

}

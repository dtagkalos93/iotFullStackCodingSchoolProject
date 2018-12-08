import { Component, OnInit } from '@angular/core';
import {MenuItem} from 'primeng/api';

@Component({
  selector: 'app-mega-menu',
  templateUrl: './mega-menu.component.html',
  styleUrls: ['./mega-menu.component.css']
})
export class MegaMenuComponent implements OnInit {

  constructor() { }

  items: MenuItem[];
  ngOnInit() {
    this.items = [
      {label: 'Home', icon: 'fa fa-fw fa-bar-chart'},
      {label: 'Room1', icon: 'fa fa-fw fa-calendar'},
      {label: 'Room2', icon: 'fa fa-fw fa-book'},
      {label: 'Room3', icon: 'fa fa-fw fa-support'},
      {label: 'Room4', icon: 'fa fa-fw fa-twitter'}
    ];
  }

}

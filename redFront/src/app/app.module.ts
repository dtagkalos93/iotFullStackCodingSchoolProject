import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CardModule} from 'primeng/card';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MegaMenuComponent } from './components/mega-menu/mega-menu.component';
import {TabMenuModule} from 'primeng/tabmenu';
import { DeviceComponent } from './components/device/device.component';
import {DataViewModule} from 'primeng/dataview';
import {DialogModule} from 'primeng/dialog';

@NgModule({
  declarations: [
    AppComponent,
    MegaMenuComponent,
    DeviceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    CardModule,
    TabMenuModule,
    DataViewModule,
    DialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

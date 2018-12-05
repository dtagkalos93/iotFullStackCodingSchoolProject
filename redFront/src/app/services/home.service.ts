import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';
import { Room } from '../models/room';
import { HttpClient, HttpHeaders } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class HomeService {
  ROOM_URL = 'http://localhost:8083/rooms/';

  constructor(private httpClient: HttpClient) { }

  getRooms(): Observable<Room[]> {
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa('redHome:homered3') });

    return this.httpClient.get<any>
      (this.ROOM_URL , { headers} ).pipe(map(response => {
        return response;
      }));
  }
}

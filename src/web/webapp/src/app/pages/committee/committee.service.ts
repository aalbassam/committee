import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from 'src/environments/environment';

@Injectable({
    providedIn: 'root'
})
export class CommitteeService {

    constructor(private _http: HttpClient) {
    }

    apiUrl = environment.apiURL;

    // get all committees
    getALLCommittee() {
        console.log('from committee service');
        return this._http.get(this.apiUrl + '/committees/');
    }

}

import { HttpClient, HttpErrorResponse, HttpParams } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  private baseUrl: string;
  constructor(@Inject('SERVER_URL') baseUrl, private httpClient: HttpClient) {
    this.baseUrl = baseUrl;
  }


  public sendGetGbsuFtbLai(inputNumber: string): Observable<any> {
    return this.httpClient.get(`${this.baseUrl}/gbsu-ftb-lai/${inputNumber}`)
      .pipe(catchError(this.handleError));
  }

  private handleError(error: HttpErrorResponse) {
    let errorMessage = 'Unknown error!';
    if (error.error instanceof ErrorEvent) {
      // Client-side errors
      errorMessage = `Error: ${error.error.message}`;
    } else {
      // Server-side errors
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.error(errorMessage);
    return throwError(errorMessage);
  }
}

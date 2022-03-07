import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }
  storedResult: NumberConverted[] = [];

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.gbsuFtbLaiService.sendGetGbsuFtbLai(inputNumber + '').subscribe((data) => {
      data = { numberToConvert: inputNumber, result: data.result };
      this.storedResult.push(data);
    });
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}

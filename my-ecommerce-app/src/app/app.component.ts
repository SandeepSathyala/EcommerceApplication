import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponentComponent } from './components/Core Components/header-component/header-component.component';
import { FooterComponentComponent } from './components/Core Components/footer-component/footer-component.component';
import { SignupComponent } from './components/Authentication Components/signup/signup.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,HeaderComponentComponent,FooterComponentComponent,SignupComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'my-ecommerce-app';
}

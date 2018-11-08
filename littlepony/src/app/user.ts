import { timingSafeEqual } from "crypto";

export class User
{
    loging: string;
    password: string;
    connected: boolean;

    constructor(loging: string)
    {
        this.loging = loging;
    }
}
